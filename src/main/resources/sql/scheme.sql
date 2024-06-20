CREATE TABLE `Member` (
    `member_id` bigint not null,
    `member_password` varchar(255) not null,
    `member_role` varchar(100) not null,
    primary key (`member_id`)
)

CREATE TABLE `Product` (
    `product_id` bigint not null,
    `product_name` varchar(255) not null,
    `product_price` int,
    `product_stockQuantity` int,
    `product_description` varchar(255),
    `product_thumbnail_url` varchar(255),
    primary key (`product_id`)
)