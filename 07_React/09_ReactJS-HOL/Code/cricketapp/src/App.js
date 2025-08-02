import React, { useState } from 'react';
import ListofPlayers from './components/ListOfPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  const [flag, setFlag] = useState(true);

  return (
    <div className="App">
      <h1>React App</h1>
      <button onClick={() => setFlag(!flag)}>
        {flag ? 'Show Indian Players' : 'Show List of Players'}
      </button>
      <hr />
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
