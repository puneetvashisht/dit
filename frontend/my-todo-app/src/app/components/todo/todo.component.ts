import { Component, OnInit } from '@angular/core';
import { TodoService } from 'src/app/services/todo.service';
import { Todo } from 'src/app/models/Todo';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  todos : Array<Todo> = []
  test : Array<string> = ['a', 'b', 'c']

  testFn(stringTodos : Array<string>){

  }


  constructor(private todoService: TodoService) { }

  ngOnInit(): void {
    
    this.todos =  this.todoService.fetchTodos();
    // this.todos = this.todoService.todos
  }

  addTodo(todo: string){
    this.todos = this.todoService.addTodo(todo);
    // this.todoService.todos.push({text: todo})
    // this.todos = this.todoService.todos
  }

  deleteTodo(index: number){
    console.log(index);
    // this.todoService.todos.splice(index, 1);
    this.todos = this.todoService.todos
  }




}
