import logo from './logo.svg';
import './App.css';

function App() {
    let posts = 'nyang nyang';
    let className = 'black-nav';
    let inlineClass = {color:'gray', fontSize: '30px'}
    function sampleFx(){
        return 100;
    }
  return (
      <div className="App">
          <div className={className}>
              <div style={inlineClass}>
                  react develop blog
              </div>
          </div>
          <img src={logo}/>
          <h4>{posts}</h4>
          <h4>{sampleFx()}</h4>
      </div>
  );
}

export default App;
