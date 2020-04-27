import React from 'react';

function Dropdown(props){
    
    return (
        <div className="dropdown">
        <button className="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            {props.caption}
        </button>
        <div className="dropdown-menushow" aria-labelledby="dropdownMenuButton">
            <a className="dropdown-item" href="#">Action</a>
            <a className="dropdown-item" href="#">Another action</a>
            <a className="dropdown-item" href="#">Something else here</a>
        </div>
        </div>
    )

}

export default Dropdown;

