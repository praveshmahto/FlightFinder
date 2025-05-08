import React from 'react';
import '../css/Banner.css'; // Create a CSS file for styling

function Banner({ companyName, tagline, imageUrl }) {
  return (
    <div className="banner-container" >
    <div className="banner-content">
        <div className="banner-text">
          <p>FLIGHT FINDER</p>
        </div>
      </div>
    </div>
  );
}

export default Banner;

