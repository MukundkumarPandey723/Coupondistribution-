// src/App.js
import React, { useState } from 'react';
import './App.css';

function App() {
  const [result, setResult] = useState('');
  const [loading, setLoading] = useState(false);

  const handleClaimCoupon = async () => {
    setLoading(true);
    try {
      const response = await fetch('http://localhost:8080/claim');
      if (!response.ok) {
        const text = await response.text();
        throw new Error(text || 'An error occurred.');
      }
      const data = await response.text();
      setResult(data);
    } catch (error) {
      setResult(error.message);
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="App">
      <div className="container">
        <h1>Claim Your Coupon</h1>
        <button onClick={handleClaimCoupon} disabled={loading}>
          {loading ? 'Claiming...' : 'Claim Coupon'}
        </button>
        {result && <div id="result">{result}</div>}
      </div>
    </div>
  );
}

export default App;
