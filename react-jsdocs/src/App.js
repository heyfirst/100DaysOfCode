import React, { Component } from "react";
import logo from "./logo.svg";
import "./App.css";
/**
 * @type {string} name A name to use.
 */
const String = "string";

/**
 * @typedef {Object<string, any>} Person
 * @property {string} name The name of the person.
 * @property {number} age The age of the person.
 * @property {Function} sayName A function that alerts the person's name.
 */

/**
 * @type {Person} person
 */
const person = {
  name: "Joe",
  age: 123,
  sayName() {
    alert(this.name);
    return 1;
  }
};

const App = () => {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <p>
          {person.name}, {person.age}
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
};

export default App;
