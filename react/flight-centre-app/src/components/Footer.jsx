import React from 'react';
import '../css/Banner.css'; 

import logo from '../assets/pravesh_face.png';

function Footer({ tagline }) {
  return (
    <div className="footer-container" > 
      <p>{tagline}</p>
       {/*<img src={logo} alt="Logo" className="logo" />*/}
    </div>
  );
}

export default Footer;

