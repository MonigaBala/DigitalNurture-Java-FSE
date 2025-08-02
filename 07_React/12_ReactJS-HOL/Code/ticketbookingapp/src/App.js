// src/App.js
import React, { useState } from 'react';

// Guest Component
function GuestPage() {
  return (
    <div>
      <h1>Please sign up.</h1>
    </div>
  );
}

// User Component
function UserPage() {
  return (
    <div>
      <h1>Welcome back</h1>
    </div>
  );
}

// Login Button
function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

// Logout Button
function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

// App Component
function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  let content;
  let button;

  if (isLoggedIn) {
    content = <UserPage />;
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    content = <GuestPage />;
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div style={{ textAlign: 'center', marginTop: '100px' }}>
      {content}
      {button}
    </div>
  );
}

export default App;
