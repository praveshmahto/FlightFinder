import logo from './logo.svg';
import './App.css';
import './css/Banner.css';
import Banner from './components/Banner';
import UserForm from './components/UserForm';

function App() {
  return (
    <div className="App">
      {/*<header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>*/}
       <Banner
            companyName="Flight Centre"
            tagline="Pravesh is assigned to determining how many instances of the word “flight” are possible in a supplied string."
          />
      <div className="form-background"> <UserForm /></div>
  
    </div>
  );
}

export default App;
