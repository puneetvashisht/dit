import { Injectable } from '@angular/core';
import { Todo } from '../models/Todo';

const key = "todos"

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  todos : Array<Todo> = []

  fetchTodos(): Array<Todo>{
    this.todos = JSON.parse(localStorage.getItem(key)) || []
    return this.todos;
  }

  addTodo(todo: string): Array<Todo>{
    var str = localStorage.getItem(key)
    if(str == null){
      this.todos = []
    }
    else{
      this.todos = JSON.parse(str);
    }
    this.todos.push({text: todo})
    localStorage.setItem(key, JSON.stringify(this.todos))
    return this.todos;
  }

  constructor() { }
}
