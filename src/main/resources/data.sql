-- Insert Users
INSERT INTO Users (name, email, contact, address, password) VALUES
('Alice Smith', 'alice@example.com', '1234567890', '123 Main St', 'password1'),
('Bob Johnson', 'bob@example.com', '2345678901', '456 Maple Ave', 'password2'),
('Charlie Davis', 'charlie@example.com', '3456789012', '789 Oak Dr', 'password3'),
('Daisy Brown', 'daisy@example.com', '4567890123', '101 Pine Rd', 'password4'),
('Ethan Wilson', 'ethan@example.com', '5678901234', '102 Birch St', 'password5'),
('Fiona Harris', 'fiona@example.com', '6789012345', '103 Cedar Ln', 'password6'),
('George Martinez', 'george@example.com', '7890123456', '104 Elm St', 'password7'),
('Hannah White', 'hannah@example.com', '8901234567', '105 Poplar Blvd', 'password8'),
('Ivy Clark', 'ivy@example.com', '9012345678', '106 Cherry Ave', 'password9'),
('Jack Lewis', 'jack@example.com', '0123456789', '107 Walnut St', 'password10');

-- Insert Orders
INSERT INTO Orders (item_name, item_Id, user_id) VALUES
('Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops', 1, 1),
('Mens Casual Premium Slim Fit T-Shirts', 2, 1),
('John Hardy Women''s Legends Naga Gold & Silver Dragon Station Chain Bracelet', 4, 2),
('Solid Gold Petite Micropave ', 5, 2),
('White Gold Plated Princess', 6, 3),
('Pierced Owl Rose Gold Plated Stainless Steel Double', 7, 4),
('WD 2TB Elements Portable External Hard Drive - USB 3.0', 9, 5),
('SanDisk SSD PLUS 1TB Internal SSD - SATA III 6 Gb/s', 10, 6),
('Silicon Power 256GB SSD 3D NAND A55 SLC Cache Performance Boost SATA III 2.5', 11, 6),
('WD 4TB Gaming Drive Works with Playstation 4 Portable External Hard Drive', 12, 7),
('BIYLACLESEN Women''s 3-in-1 Snowboard Jacket Winter Coats', 18, 8),
('Lock and Love Women''s Removable Hooded Faux Leather Moto Biker Jacket', 19, 9),
('Rain Jacket Women Windbreaker Striped Climbing Raincoats', 20, 9),
('MBJ Women''s Solid Short Sleeve Boat Neck V', 21, 10),
('Opna Women''s Short Sleeve Moisture', 22, 10);
