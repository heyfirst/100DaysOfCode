import React, { useState } from "react";

const Todolist: React.FC = () => {
  const [text, setText] = useState("");

  return (
    <div>
      <form>
        <div>
          <label htmlFor="">New Todo: </label>
          <input
            type="text"
            onChange={e => setText(e.target.value)}
            value={text}
          />
        </div>
      </form>
      <hr />
      <ul>
        <li>Todo1</li>
        <li>Todo2</li>
      </ul>
    </div>
  );
};

export default Todolist;
