import React from 'react';
import '../css/Banner.css'; // Create a CSS file for styling

function Banner({ companyName, tagline, imageUrl }) {
  return (
    <div className="banner-container" style={{ backgroundImage: `url(${imageUrl})` }}>
      <div className="banner-content">
        <div>
         <img  src="https://cloudinary.fclmedia.com/fctg/image/upload/websites/fc-global/logo_white.svg" alt="Flight Centre" className="aurora-1v8eun1"></img>
        </div>
       
        {/* Add other elements like buttons or logos as needed */}
      </div>
    </div>
  );
}

export default Banner;

