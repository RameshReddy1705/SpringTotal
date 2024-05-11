import React from "react"
import abc from "./Ajio.module.css"
import logoo from "./Ajio-Logo.svg"
const Ajio=()=>{
    return(
        <div>
                    <section id={abc.Bar}>
                <article>
                    <div className={abc.logo}>

                        <img src={logoo} alt="" />
                    
                    </div>
                    <div className={abc.menu}>
                        <ol>
                            <li><a href="">MEN</a></li>
                            <li><a href="">WOMEN</a></li>
                            <li><a href="">KID</a></li>
                            <li><a href="">INDIE</a></li>
                            <li><a href="">HOME AND KITCHEN</a></li>
                            <input autocomplete="off" role="combobox" aria-autocomplete="list" aria-owns="react-autowhatever-1" aria-expanded="true" aria-haspopup="true" class="react-autosuggest__input react-autosuggest__input--open" placeholder="Search AJIO" name="searchVal" type="text" value=""></input>
                        </ol>
                    </div>
                    <div className={abc.topbar}>
                        <ol>
                            <li><a href="">sign In/Join Ajio</a></li>
                            <li><a href="">Custermer Care</a></li>
                            <li><a href="">Visit AjioLuxe</a></li>
                        </ol>
                    </div>
                    <div className={abc.search}>
                        
                    </div>
                </article>
            </section>
            {/* <section id={abc.img}>
            <img name="main-banner" src="https://assets.ajio.com/cms/AJIO/WEB/28122022-UHP-D-MainBanner-P1-TopSelectBrands-USPALevis-3050.jpg" alt="asd" style="position: relative; width: 100%;"/>

            </section>
             */}
        </div>
    )
}
export default Ajio 