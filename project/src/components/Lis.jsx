import { Fragment, useState } from "react"
import abc from "./userData.json"
const Lis=()=>{
    let [content, setContent]=useState(abc)
    return(
        <div>
            <h1>https://api.github.com/users</h1>
            {content.map((x)=>{
               return(
                <Fragment key={x.id}>
                <h1>{x.login}</h1>
                <h1>{x.id}</h1>
                <img src={x.avatar_url} alt="" />
                <h1>{x.node_id}</h1>
                </Fragment>
               )
            })}
        </div>
    )
}
export default Lis