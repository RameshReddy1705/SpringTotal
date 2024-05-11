import React from 'react'
import myn from './myntra.module.css';
import abc from './mynt.png'
const Myntra = () => {

  return (
    <div>
      <section id={myn.navbar}>
        <article>
          <div className={myn.first}><ul><li><img src={abc} alt="" /></li></ul></div>
          <div className={myn.second}><ul>
          <li>MEN</li>
          <li>WOMEN</li>
          <li>KIDS</li>
          <li>HOME & LIVING</li>
          <li>BEAUTY</li>
          <li>STUDIO</li></ul></div>
          <div className={myn.third}><ul>
            <li><input class="form-control me-2" type="search" placeholder="Search for product & brand and more" aria-label="Search"/></li></ul></div>
          <div className={myn.forth}><ul>
          <li><i class="fa-solid fa-user"></i></li>
          <li><i class="fa-solid fa-heart"></i></li>
          <li><i class="fa-solid fa-bag-shopping"></i></li></ul></div>
        </article>
      </section>
    </div>
  )
}

export default Myntra
