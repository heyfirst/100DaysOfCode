import React from "react";
import ReactDOM from "react-dom";
import App from "./App";

describe("empty", () => {
  it("always true", () => {
    expect(true).toBe(true);
  });
});

it("renders without crashing", () => {
  const div = document.createElement("div");
  ReactDOM.render(<App />, div);
  ReactDOM.unmountComponentAtNode(div);
});
