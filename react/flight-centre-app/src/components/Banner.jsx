import React from 'react';
import '../css/Banner.css'; 

function Banner({ companyName, imageUrl }) {
  return (
    <div className="banner-container" >
     
    <div className="banner-content">
        <div className="banner-text">
          <p>{companyName}</p>
        </div>
      </div>
    </div>
  );
}

export default Banner;

