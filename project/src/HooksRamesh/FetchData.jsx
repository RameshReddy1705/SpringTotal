import axios from "axios"
import { useEffect, useState } from "react"

const FetchData=()=>{
    let [abc, setAbc]=useState([])
    let [id, setId]=useState(1)
    let [cc, setCc]=useState(1)

    useEffect(()=>{
        axios.get(`https://jsonplaceholder.typicode.com/posts/${cc}`)
        .then((response)=>{
            // console.log(response.data)
            console.log("get data")
            setAbc(response.data)
        })
        
    },[cc])

    let idData=(r)=>{
        setId(r.target.value)
    }
    let ccData=()=>{
        setCc(id)
    }
    // console.log(abc[0].title)
    return(
        <div>
            {/* {abc.map((x)=>{
                return(
                    <div>
                        {x.title}
                    </div>
                )
            })} */}
            <input type="text" value={id} onChange={idData}/>
            <button onClick={ccData}>Submit</button>
            {abc.title}
        </div>
    )
}
export default FetchData