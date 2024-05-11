import { useState } from "react"
import dummyData from "./userData.json"
const FetchData =()=>{
    let [content]=useState(dummyData)
    console.log(content)
    return(
        <div>
            {content.map((x)=>{
                console.log(x)
                return(
                    <div>
                        <h1>{x.login}</h1>
                        <h1>{x.id}</h1>
                        <img src={x.avatar_url}alt="" />
                    </div>
                )
            })}

            
        </div>
    )
}

export default FetchData