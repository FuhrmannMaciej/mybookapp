import {RouteInfo} from './sidebar.metadata';

export const ROUTES: RouteInfo[] = [
  {
    path: '',
    title: 'Home Page',
    icon: 'mdi mdi-home',
    class: '',
    label: '',
    labelClass: '',
    extralink: false,
    submenu: []
  },
  {
    path: '',
    title: 'Books',
    icon: '',
    class: 'nav-small-cap',
    label: '',
    labelClass: '',
    extralink: true,
    submenu: []
  },
  {
    path: 'books/list',
    title: 'Book List',
    icon: 'mdi mdi-book-open-page-variant',
    class: '',
    label: '',
    labelClass: '',
    extralink: false,
    submenu: []
  },
  {
    path: 'books/add',
    title: 'Add Book',
    icon: 'mdi mdi-book-plus',
    class: '',
    label: '',
    labelClass: '',
    extralink: false,
    submenu: []
  }

];
