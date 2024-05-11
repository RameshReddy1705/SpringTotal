import { Fragment, useState } from "react"
import Details from "./userData.json"
const FetchData=()=>{
    let [Data,setData]=useState(Details)
    console.log(Data)
    return(
        <div>
            {
                Data.map((x)=>{
                    return(
                        <Fragment key={x.id}>
                            <h1>{x.login}</h1>
                            <h1>{x.id}</h1>
                            <h1>{x.html_url}</h1>
                            <img src={x.avatar_url} alt="" />
                            <h1>{x.html_url}</h1>
                        </Fragment>
                    )
                })
            }
        </div>
    )
}
export default FetchData