import React, { useState } from 'react';
import '../css/UserForm.css'; 

function UserForm() {
  const [user, setUser] = useState({ word: 'flight', jumbled: '' });
  const [wordCount, setWordCount] = useState(null);
  const handleSubmit = (event) => {
    event.preventDefault();
    fetch('http://localhost:8080/api/postWordCount', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(user),
    })
      .then(response => response.json())
      .then(data => {
        console.log('User created:', data)
        console.log('Word Count:', data.wordCount);
        setWordCount(data.wordCount);
      })
      .catch(error => console.error('Error creating user:', error));
  };

  const handleChange = (event) => {
    const { name, value } = event.target;
    let inputValue = value.toLowerCase();
    setUser(prevUser => ({ ...prevUser, [name]: inputValue }));
  };

  return (
    <form onSubmit={handleSubmit} >
      {
        wordCount !== null && (
          <div className="alignResult" role="alert">
            Word Count: {wordCount}
          </div>
        )
      }
      <div className="form-group">
        <label htmlFor="word">Search Word:</label>
        <input
          type="text"
          name="word"
          id="word"
          value={user.word}
          onChange={handleChange}
          className="form-control"
        />
      </div>

      <div className="form-group">
        <label htmlFor="jumbled">Jumbled String:</label>
        <textarea maxLength={100} rows={4} cols={40}
          type="textarea"
          name="jumbled"
          id="jumbled"
          value={user.jumbled}
          onChange={handleChange}
          className="form-control"
        />
      </div>

      <button type="submit" className="btn btn-primary">How many word occurences?</button>
    </form>
  );
}

export default UserForm;