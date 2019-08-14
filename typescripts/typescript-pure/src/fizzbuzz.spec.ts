import { fizzbuzz } from "./fizzbuzz";

describe("fizzbuzz", () => {
  let fzb: fizzbuzz;

  beforeEach(() => (fzb = new fizzbuzz()));

  test("should return 1 when input 1", () => {
    expect(fzb.say(1)).toBe("1");
  });

  test("should return 2 when input 2", () => {
    expect(fzb.say(2)).toBe("2");
  });

  test("should return fizz when input 3", () => {
    expect(fzb.say(3)).toBe("fizz");
  });

  test("should return buzz when input 5", () => {
    expect(fzb.say(5)).toBe("buzz");
  });

  test("should return fizz when input 6", () => {
    expect(fzb.say(6)).toBe("fizz");
  });

  test("should return fizz when input 9", () => {
    expect(fzb.say(9)).toBe("fizz");
  });

  test("should return buzz when input 10", () => {
    expect(fzb.say(10)).toBe("buzz");
  });

  test("should return fizzbuzz when input 15", () => {
    expect(fzb.say(15)).toBe("fizzbuzz");
  });
});
