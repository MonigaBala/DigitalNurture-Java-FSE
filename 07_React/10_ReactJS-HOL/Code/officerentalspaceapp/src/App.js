import React from 'react';
import './App.css';
import officeImage from './office.jpg'; // Replace with your image path

function App() {
  const officeList = [
    { Name: 'DBS', Rent: 50000, Address: 'Chennai' }
  
  ];

  return (
    <div className="App">
      <h1>Office Space , at Affordable Range</h1>
      <img src={officeImage} width="25%" height="25%" alt="Office Space" />

      {officeList.map((item, index) => {
        let colorClass = item.Rent <= 60000 ? 'textRed' : 'textGreen';

        return (
          <div key={index}>
            <h2>Name: {item.Name}</h2>
            <h3 className={colorClass}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
            
          </div>
        );
      })}
    </div>
  );
}

export default App;
