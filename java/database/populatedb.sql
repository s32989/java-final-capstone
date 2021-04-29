BEGIN TRANSACTION;

INSERT INTO public.users ( username, password_hash, role, activated, deleted) VALUES ( 'user1', '$2a$10$QBbJ5oIACbcA6w5qQ/iiouEphQGhGXUxtwvbwWn2072rb6iZAoNsG', 'ROLE_USER', true, false);
INSERT INTO public.users ( username, password_hash, role, activated, deleted) VALUES ( 'user2', '$2a$10$z.ZfdTwrjZkadjTKZIgD5OrM9ovN2QacC75UTX1E/vEttq8Qh9D.C', 'ROLE_USER', true, false);
INSERT INTO public.users ( username, password_hash, role, activated, deleted) VALUES ( 'user3', '$2a$10$EciTGklE6FirjBtwa9ApOONEbCemuS9GwaxgrvypP/RrGfcRto95W', 'ROLE_USER', true, false);

INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 3, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607573500/3/yi2wwpz37sedzb8eujko.jpg', 'sheep.jpg', '3/yi2wwpz37sedzb8eujko', 'my sheeps', false, false );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 3, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607573532/3/mwaa6n4pmzdpcyypeule.jpg', 'bike.jpg', '3/mwaa6n4pmzdpcyypeule', 'red bike', false, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 3, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574059/3/zgqnlklydhkrppoomy1y.jpg', 'bicycle.jpg', '3/zgqnlklydhkrppoomy1y', 'red bike', false, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 3, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574078/3/xqmz9fieg8d1conmztsk.jpg', 'boy-snow-hoodie.jpg', '3/xqmz9fieg8d1conmztsk', '..', true, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 3, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574091/3/ngihonkghsvthrth2lll.jpg', 'jazz.jpg', '3/ngihonkghsvthrth2lll', '..', true, false );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 4, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574173/4/waqhjmnhecqtuyomih9c.jpg', 'kitchen-bar.jpg', '4/waqhjmnhecqtuyomih9c', 'cook', false, false );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 4, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574191/4/nfpfdlpl2ybm8r6vzmdu.jpg', 'smiling-man.jpg', '4/nfpfdlpl2ybm8r6vzmdu', '..', false, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 4, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574227/4/xz7fjwvhu2bojdtwyorx.jpg', 'nature-mountains.jpg', '4/xz7fjwvhu2bojdtwyorx', '..', false, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 4, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574237/4/g1hcv2ltr2bc7tq38gbv.jpg', 'girl-urban-view.jpg', '4/g1hcv2ltr2bc7tq38gbv', '..', false, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 4, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574282/4/bfu0tdnvlbvr9i42e4wo.jpg', 'architecture-signs.jpg', '4/bfu0tdnvlbvr9i42e4wo', '..', true, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 4, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574357/4/zmmo04gwgvdheou28pkp.jpg', 'beach-boat.jpg', '4/zmmo04gwgvdheou28pkp', '..', false, false );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 5, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574392/5/icv72lcynltpie0ahzwh.jpg', 'dessert.jpg', '5/icv72lcynltpie0ahzwh', '..', false, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 5, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574424/5/rc5sotwydcrtea3ouhtw.jpg', 'fish-vegetables.jpg', '5/rc5sotwydcrtea3ouhtw', 'fish', false, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 5, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574451/5/fimjg7c4iedjfzkzzryg.jpg', 'pot-mussels.jpg', '5/fimjg7c4iedjfzkzzryg', 'love mussels', false, false );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 5, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574463/5/ev27myglfexomdwjp5pd.jpg', 'spices.jpg', '5/ev27myglfexomdwjp5pd', '..', true, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 1, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574486/1/ebnrutmrrhaa8d7fpqyr.jpg', 'cat.jpg', '1/ebnrutmrrhaa8d7fpqyr', '..', false, false );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 1, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574533/1/bdhrxjcitqrwojsvlzod.jpg', 'reindeer.jpg', '1/bdhrxjcitqrwojsvlzod', 'deer', false, true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 1, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607574554/1/tuarjpgb2e1bkqhzk1ho.jpg', 'three-dogs.jpg', '1/tuarjpgb2e1bkqhzk1ho', 'my dogs', true,true );
INSERT INTO public.pictures ( user_id, pic_url, pic_name, pic_server_name, description, private, favorite ) VALUES ( 1, 'https://res.cloudinary.com/dr1xyxwvj/image/upload/v1607658371/6/otwrz1srklxenfwd83pp.png', 'Titatnic.jpg', '1/tuarjpgb2e1bkqhzk1ho', 'my dogs', true, false );



INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 1, 2, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 2, 1, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 3, 1, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 3, 3, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 3, 4, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 3, 5, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 4, 5, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 6, 5, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 6, 1, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 6, 3, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 7, 4, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 7, 5, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 7, 1, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 5, 4, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 5, 5, 3);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 5, 5, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 5, 1, 2);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 8, 1, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 8, 3, 2);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 8, 4, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 8, 5, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 9, 5, 2);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 9, 1, 3);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 9, 3, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 9, 4, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 10, 3, 3);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 10, 4, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 10, 5, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 11, 3, 2);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 11, 1, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 11, 4, 3);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 11, 5, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 12, 1, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 12, 3, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 12, 4, 3);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 13, 5, 1);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 13, 4, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 13, 3, 5);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 13, 1, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 13, 5, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 14, 5, 3);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 14, 4, 4);
INSERT INTO public.ratings ( picture_id, user_id, rating) VALUES ( 14, 1, 2);



INSERT INTO public.likes ( picture_id, user_id) VALUES ( 1, 4);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 1, 5);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 1, 1);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 2, 1);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 2, 5);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 2, 4);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 2, 3);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 10, 3);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 10, 4);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 10, 5);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 10, 1);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 11, 1);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 11, 3);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 11, 4);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 11, 5);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 9, 5);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 9, 4);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 8, 3);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 8, 4);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 7, 1);
INSERT INTO public.likes ( picture_id, user_id) VALUES ( 7, 3);


INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 7, 1, 'good picture');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 7, 2, 'agreed good picture');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 7, 3, 'average picture');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 8, 3, 'average picture');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 8, 4, 'abcd picture');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 8, 5, 'What else is new?');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 9, 4, 'Caption that!');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 9, 4, 'Houston, we have a problem');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 9, 3, 'I could take a better shot!');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 10, 3, 'lemme see what we got here...');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 10, 4, 'nice');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 10, 1, 'looks good');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 10, 2, 'This comment doesnt make any sense');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 11, 4, 'lol');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 11, 1, 'Hit me up whoever took this picture');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 11, 3, 'Why doesnt this app have emojis?');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 11, 5, 'I want another album from Odesza');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 12, 3, 'Do you know who you are?');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 12, 4, 'Cannot wait for this pandemic to be over');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 12, 5, 'I love EDM');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 13, 3, 'Steak should be cooked medium-rare');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 13, 4, 'When am I gonna get a job?');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 13, 5, 'I want a spaceship');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 14, 4, 'Netflix and chill');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 14, 5, 'If I become rich I will sell this app to myself and donate the money');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 14, 3, 'Craving ice is a sympton of iron deficiancy');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 14, 1, 'There are more life forms on your body than people on Earth');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 15, 1, 'Snakes can predict earthquakes');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 15, 5, 'Volkswagen also makes sausages');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 15, 4, 'Sausage party is a funny cartoon!');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 16, 3, 'A ship, a duck and a rooster were the fisrt passengers in a hot air balloon');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 16, 4, 'Ducks in apples are delicious!');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 16, 1, 'Skydiving is breathtaking');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 17, 3, 'High heels were first designed for men');
INSERT INTO public.comments ( picture_id, user_id, comment) VALUES ( 17, 3, 'Some are still wearing them today');


COMMIT TRANSACTION;

