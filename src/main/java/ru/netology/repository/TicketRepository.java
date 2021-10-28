package ru.netology.repository;
import ru.netology.domain.Ticket;
public class TicketRepository {
    private Ticket[] items = new Ticket[0];

        //Сохранить билет в массив
        public void add(Ticket item) {
            int length = items.length + 1;
            Ticket[] tmp = new Ticket[length];
            System.arraycopy(items, 0, tmp, 0, items.length);
            int lastIndex = tmp.length - 1;
            tmp[lastIndex] = item;
            items = tmp;
        }

        //Найти все билеты
        public Ticket[] findAll() {
            return items;
        }

        //Найти билет по id
        public Ticket findById(int id) {
            for (Ticket item : items) {
                if ((item.getId() == id)) {
                    return item;
                }
            }
            return null;
        }

        //Удалить билет по id
        public void removeById(int id) {
            int length = items.length - 1;
            Ticket[] tmp = new Ticket[length];
            int index = 0;
            for (Ticket item : items) {
                if (item.getId() != id) {
                    tmp[index] = item;
                    index++;
                }
            }
            items = tmp;
        }

    }




