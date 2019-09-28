FROM golang:1.13-alpine AS builder

RUN apk update && apk add --no-cache git ca-certificates tzdata && update-ca-certificates
RUN adduser -D -g '' appuser

RUN mkdir -p /go/src/app
WORKDIR /go/src/app
COPY . .

RUN CGO_ENABLED=0 GOOS=linux go build -ldflags="-w -s" -a -installsuffix cgo -o ./tmp/main

FROM scratch 
# Import from builder.
COPY --from=builder /usr/share/zoneinfo /usr/share/zoneinfo
COPY --from=builder /etc/ssl/certs/ca-certificates.crt /etc/ssl/certs/
COPY --from=builder /etc/passwd /etc/passwd
# Use an unprivileged user.

COPY --from=builder /go/src/app/tmp/main .

USER appuser

ENTRYPOINT ["./main"]