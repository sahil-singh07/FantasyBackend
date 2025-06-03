INSERT INTO event (name, points, is_completed) VALUES ('Philip Salt scores 50+', 200, false);         -- 50*4
INSERT INTO event (name, points, is_completed) VALUES ('Virat Kohli hits a century', 400, false);     -- 100*4
INSERT INTO event (name, points, is_completed) VALUES ('Mayank Agarawal hits 3 sixes', 30, false);     -- 3*10
INSERT INTO event (name, points, is_completed) VALUES ('Rajat Patidar scores 75+', 300, false);        -- 75*4
INSERT INTO event (name, points, is_completed) VALUES ('Liam Livingstone strike rate 150+', 50, false);-- Bonus
INSERT INTO event (name, points, is_completed) VALUES ('Jitesh Sharma hits 4 boundaries', 20, false);  -- 4*5
INSERT INTO event (name, points, is_completed) VALUES ('Romario Shepherd takes 2 wickets', 60, false); -- 2*30
INSERT INTO event (name, points, is_completed) VALUES ('Krunal Pandya economy < 6', 25, false);        -- Bonus
INSERT INTO event (name, points, is_completed) VALUES ('Bhuvneshwar Kumar swings the ball', 20, false);-- Fielding
INSERT INTO event (name, points, is_completed) VALUES ('Yash Dayal bowls a maiden over', 30, false);   -- Bonus
INSERT INTO event (name, points, is_completed) VALUES ('Josh Hazlewood takes 3 wickets', 90, false);   -- 3*30
INSERT INTO event (name, points, is_completed) VALUES ('Priyansh Arya hits a six on debut', 10, false);-- 1*10
INSERT INTO event (name, points, is_completed) VALUES ('Josh Inglis scores 40+', 160, false);          -- 40*4
INSERT INTO event (name, points, is_completed) VALUES ('Shreyas Iyer hits a 50+', 200, false);         -- 50*4
INSERT INTO event (name, points, is_completed) VALUES ('Nehal Wadhera strike rate 140+', 40, false);   -- Bonus
INSERT INTO event (name, points, is_completed) VALUES ('Shashank Singh takes a diving catch', 20, false); -- Fielding
INSERT INTO event (name, points, is_completed) VALUES ('Marcus Stoinis hits 3 sixes', 30, false);      -- 3*10
INSERT INTO event (name, points, is_completed) VALUES ('Azmatullah Omarzai all-round performance', 80, false); -- Mixed
INSERT INTO event (name, points, is_completed) VALUES ('Kyle Jamieson bowls yorker to get wicket', 30, false); -- 1*30
INSERT INTO event (name, points, is_completed) VALUES ('Vijaykumar Vyshak economy < 5', 30, false);    -- Bonus
INSERT INTO event (name, points, is_completed) VALUES ('Arshdeep Singh takes 2+ wickets in powerplay', 60, false); -- 2*30
INSERT INTO event (name, points, is_completed) VALUES ('Yuzvendra Chahal takes 3 wickets', 90, false); -- 3*30
INSERT INTO event (name, points, is_completed) VALUES ('RCB scores 180+ total', 720, false);            -- 180*4
INSERT INTO event (name, points, is_completed) VALUES ('PBKS scores 180+ total', 720, false);           -- 180*4
INSERT INTO event (name, points, is_completed) VALUES ('RCB loses wicket in first over', 10, false);    -- Bonus
INSERT INTO event (name, points, is_completed) VALUES ('PBKS loses 2 wickets in powerplay', 60, false); -- 2*30
INSERT INTO event (name, points, is_completed) VALUES ('RCB hits 10+ sixes', 100, false);               -- 10*10
INSERT INTO event (name, points, is_completed) VALUES ('PBKS hits 5+ sixes', 50, true);                 -- 5*10
INSERT INTO event (name, points, is_completed) VALUES ('RCB bowlers bowl 2 maidens', 60, false);        -- 2*30
INSERT INTO event (name, points, is_completed) VALUES ('RCB takes 3 catches', 60, false);               -- 3*20 (assuming 20 points per catch)



INSERT INTO users (id, email, password, name) VALUES
(1, 'john.doe@example.com', 'password123', 'John Doe'),
(2, 'jane.smith@example.com', 'securepass', 'Jane Smith');

INSERT INTO teams (id) VALUES (1);
INSERT INTO teams (id) VALUES (2);
INSERT INTO teams (id) VALUES (3);

-- Team 1 with events 1 to 11
INSERT INTO team_events (team_id, event_id) VALUES (1, 1), (1, 5), (1, 6), (1, 14), (1, 12),
                                                    (1, 25), (1, 30), (1, 13), (1, 17), (1, 9), (1, 21);

-- Team 2 with events 12 to 22
INSERT INTO team_events (team_id, event_id) VALUES (2, 28), (2, 23), (2, 24), (2, 15), (2, 13),
                                                    (2, 6), (2, 30), (2, 21), (2, 16), (2, 12), (2, 1);

-- Team 3 with a mix of events
INSERT INTO team_events (team_id, event_id) VALUES (3, 23), (3, 24), (3, 27), (3, 28), (3, 30),
                                                    (3, 5), (3, 1), (3, 12), (3, 13), (3, 14), (3, 22);

