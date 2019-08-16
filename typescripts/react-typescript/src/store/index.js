import { createStore, combineReducers, compose } from "redux";

// Ducks store
import app from "./app";

// Get the Redux DevTools extension and fallback to a no-op function
let devtools = f => f;
if (process.browser && window.__REDUX_DEVTOOLS_EXTENSION__) {
  devtools = window.__REDUX_DEVTOOLS_EXTENSION__();
}

export const initStore = (initialState = {}) => {
  return createStore(
    combineReducers({
      app
    }),
    initialState,
    compose(devtools)
  );
};
