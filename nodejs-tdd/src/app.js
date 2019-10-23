const express = require('express')
const helmet = require('helmet')
const compression = require('compression')
const bodyParser = require('body-parser')
const cors = require('cors')
const morgan = require('morgan')

const routes = require('./routes')

const app = express()

app.use(helmet())
app.use(compression())
app.use(bodyParser.json())
app.use(cors())
app.use(morgan('tiny'))
app.disable('x-powered-by')

app.use(routes)

module.exports = app
