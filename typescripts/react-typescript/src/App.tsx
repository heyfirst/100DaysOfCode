import React from "react";
import { Provider } from "react-redux";
import "./App.css";
import Todolist from "./components/Todolist";
import { initStore } from "./store";

const store = initStore();

const App: React.FC = () => {
  return (
    <Provider store={store}>
      <div className="App">
        <Todolist />
      </div>
    </Provider>
  );
};

export default App;
