// src/main/frontend/src/App.js

import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
  const [hello, setHello] = useState('')

  useEffect(() => {
    axios.get('/api/hello')
        .then(response => setHello(response.data))
        .catch(error => console.log(error))
  }, []);

  return (
      <div>
          백엔드에서 가져온 데이터입니다 : {hello}
          <button onClick={()=>{
            axios.get('/api/test')
                .then(res => console.log(res.data));
            const params = {uid: 1}
            axios.get("/api/mybatis", {params})
                .then(res => console.log(res.data));
          }}>click</button>
      </div>
  );
}

export default App;