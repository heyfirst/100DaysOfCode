const ADD_TASK = "ADD_TASK";

// InitialState
let InitialState = {
  loading: true
};

export default function reducer(state = InitialState, action) {
  switch (action.type) {
    case ADD_TASK: {
      return {
        ...state
      };
    }

    default:
      return state;
  }
}

export const actions = {
  addTodo: payload => ({
    type: ADD_TASK,
    payload
  })
};
