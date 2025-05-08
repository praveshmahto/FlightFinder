import './App.css';
import './css/Banner.css';
import Banner from './components/Banner';
import Footer from './components/Footer';
import UserForm from './components/UserForm';

function App() {
  return (
    <div className="App">
      
      <Banner companyName="FLIGHT FINDER" />

      <div className="form-background"> <UserForm /></div>

      <Footer
        tagline="Pravesh is assigned to determining how many instances of the word “flight” are possible in a supplied string."
      />

    </div>
  );
}

export default App;
