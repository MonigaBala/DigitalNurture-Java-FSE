// src/App.js
import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [selectedComponent, setSelectedComponent] = useState('');
  const [showCourse, setShowCourse] = useState(false); // For && example

  const renderComponent = () => {
    // 1. if-else conditional rendering
    if (selectedComponent === 'book') {
      return <BookDetails />;
    } else if (selectedComponent === 'blog') {
      return <BlogDetails />;
    }

    // 2. switch statement rendering
    switch (selectedComponent) {
      case 'course':
        return <CourseDetails />;
      default:
        return <p>Please select a section to view details.</p>;
    }
  };

  return (
    <div style={{ textAlign: 'center' }}>
      <h1>Blogger App</h1>

      <div>
        <button onClick={() => setSelectedComponent('book')}>Book Details</button>
        <button onClick={() => setSelectedComponent('blog')}>Blog Details</button>
        <button onClick={() => setSelectedComponent('course')}>Course Details</button>
        <button onClick={() => setShowCourse(!showCourse)}>
          Toggle Course with &&
        </button>
      </div>

      <hr />

      {/* 3. Ternary operator rendering */}
      <div>
        {selectedComponent ? (
          <h2>Showing {selectedComponent.charAt(0).toUpperCase() + selectedComponent.slice(1)} Details</h2>
        ) : (
          <h2>No section selected</h2>
        )}
      </div>

      {/* 4. && operator rendering */}
      <div>
        {showCourse && <CourseDetails />}
      </div>

      {/* 5. Using IIFE */}
      <div>
        {
          (() => {
            if (selectedComponent === 'book') return <p>(IIFE) This is the Book section.</p>;
            if (selectedComponent === 'blog') return <p>(IIFE) This is the Blog section.</p>;
            if (selectedComponent === 'course') return <p>(IIFE) This is the Course section.</p>;
          })()
        }
      </div>

      <hr />

      {/* Main renderer using if-else and switch */}
      {renderComponent()}
    </div>
  );
}

export default App;
