USE suppenstube;
INSERT INTO roles (`id`, `role`)
VALUES
    (1, 'OWNER'),
    (2, 'DELIVER'),
    (3, 'USER');

INSERT INTO menu_item (`id`, `label`, `name`, `price`)
VALUES
    (0, 0, 'Rote Linsen-Kokos-Suppe', 8.5),
    (1, 0, 'Scharfe Weiße Bohnen-Suppe',8.3),
    (2, 0, 'Karotten-Ingwer-Orangen-Suppe',8),
    (3, 1, 'Soljanka',9);

INSERT INTO news (`id`, `headline`, `text`)
VALUES
    (0, 'Mitnahmebehälter', "2019 ist noch jung und wir starten gleich mit guten Vorsätzen:
                                   Ab sofort gibt's bei uns Mitnahmebehälter ohne Plastik, dafür 100% biologisch abbaubar und kompostierbar für 1,00 €.
                                   Oder ihr bringt gleich eure eigenen Behältnisse mit.
                                   Seid dabei! <br>"),
    (1, "Aus \"Suppenstube\" wurde \"Bistro Wandel-Bar\"", "<b>An alle Menschen, die an der Wandlung und Verwandlung dieser Location interessiert sind.</b><br>
                                                              Hier im Hintergrund, weitestgehend noch unsichtbar, passiert gerade so Einiges.
                                                              Wir befinden uns inmitten einer großen Veränderung. <br>
                                                              Gern möchten wir euch auf diesem Weg mitnehmen, denn ihr seid es ja, die uns tragen und die die Suppenstube so groß werden ließen.
                                                              Nun, nach genau 15 Jahren, haben wir uns entschlossen, unsere Rechtsform zu ändern, den Namen dieses Unternehmens und auch unser Tätigkeitsfeld zu optimieren und es bald auch zu erweitern.<br>
                                                              Und so wandeln wir uns nun Schritt für Schritt in eine neue Zeit hinein.
                                                              <br>");

