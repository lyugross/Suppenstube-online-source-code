USE suppenstube;
INSERT INTO roles (`id`, `role`)
VALUES
    (1, 'OWNER'),
    (2, 'DELIVER'),
    (3, 'USER');

INSERT INTO menu_item (`id`, `label`, `name`, `price`)
VALUES
    (0, 'VEGAN', 'Rote Linsen-Kokos-Suppe', 8.5),
    (1, 'VEGAN', 'Scharfe Weiße Bohnen-Suppe',8.3),
    (2, 'VEGAN', 'Karotten-Ingwer-Orangen-Suppe',8),
    (3, 'MEAT', 'Soljanka',9);
