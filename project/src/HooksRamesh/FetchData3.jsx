import axios from "axios"
import { useEffect, useState } from "react"
const FetchData3=()=>{
    let[data, setdata]=useState("")
    let [id, setId]=useState("")

        useEffect(()=>{
            axios.get(`https://jsonplaceholder.typicode.com/posts/${id}`)
            .then((response)=>{
                setdata(response.data)
                console.log("Got the data");
            })
            .catch(()=>{
                console.log("not found");
            })
        },[id])
        let change=(r)=>{
            setId(r.target.value)
        }
        console.log(data);
     return(
        <div>
            <input type="text" value={id} onChange={change} />
             {/* {
                data.map((a)=>{
                    return(
                        <div>
                            <h1>{a.id}</h1>
                            
                        </div>
                    )
                })
            } */}
        </div>
     )
}
export default FetchData3