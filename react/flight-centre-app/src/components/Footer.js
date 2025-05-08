import React from 'react';
import '../css/Banner.css'; 

function Footer({ companyName, tagline, imageUrl }) {
  return (
    <div className="footer-container" > 
      <p>{tagline}</p>
    </div>
  );
}

export default Footer;

