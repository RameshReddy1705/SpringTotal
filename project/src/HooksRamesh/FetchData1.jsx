import axios from "axios"
import { useEffect, useState } from "react";

const FetchData1=()=>{
    let [content, setcontent]=useState([])
    let [id, setid]=useState("")
    let [ch, setch]=useState("")
    useEffect(()=>{
        axios.get(`https://jsonplaceholder.typicode.com/posts/${ch}`)
        .then((response)=>{
            setcontent(response.data);
            console.log("Got tha data");
        }).catch(()=>{
            console.log("Not found data");
        })
    },[ch])
    let idData=(e)=>{
        setid(e.target.value)
    }
    let change=()=>{
        setch(id)
    }
    console.log(content);
    return(
        <div>
            <input type="text" value={id} onChange={idData}/>
            <button onClick={change}>Fetch Data</button>
            <h1>{content.id}</h1>
            <h1>{content.body}</h1>
            {/* {content.map((a)=>{
                    return(
                        <div>
                            <h1>{a.id}</h1>
                            <h1>{a.body}</h1>
                        </div>
                    )
                })
            } */}
        </div>
    )
}
export default FetchData1