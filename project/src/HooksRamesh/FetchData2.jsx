import axios from "axios"
import { useEffect, useState } from "react"

const FetchData2=()=>{
    let [data, setData]=useState("")
    let [id, setId]=useState("")
    let [ch, setCh]=useState("")
    useEffect(()=>{
        axios.get(`https://api.github.com/users/${ch}`)
        .then((response)=>{
            setData(response.data)
            console.log("Got data");
        }).catch(()=>{
            console.log("Data not found");
        })
    },[ch])
    let change=(r)=>{
        setId(r.target.value)
    }
    let fetchData=()=>{
        setCh(id)
    }
    console.log(data);
    return(
        <div>
            <input type="text" value={id} onChange={change}/>
            <button onClick={fetchData}>Fetch</button>

            <h1>{data.id}</h1>
            <h1>{data.login}</h1>
            
            {/* {
                data.map((a)=>{
                    return(
                        <div>
                            <h1>{a.id}</h1>
                            <h1>{a.login}</h1>
                            <h1>{a.node_id}</h1>
                        </div>
                    )
                })
            } */}
        </div>
    )
}
export default FetchData2