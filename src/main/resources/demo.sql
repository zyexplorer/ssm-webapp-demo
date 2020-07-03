#创建数据库表数据
CREATE DATABASE IF NOT EXISTS `wenwo`;
USE `wenwo`;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`   int(11)                                                       NOT NULL AUTO_INCREMENT,
    `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
    `age`  int(3)                                                        NOT NULL DEFAULT '0',
    `job`  varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;


INSERT INTO `wenwo`.`user`(`id`, `name`, `age`, `job`) VALUES (1, '张三', 13, '搬砖');
INSERT INTO `wenwo`.`user`(`id`, `name`, `age`, `job`) VALUES (2, '李四', 23, '程序猿');
INSERT INTO `wenwo`.`user`(`id`, `name`, `age`, `job`) VALUES (3, '赵老二', 18, '打桩');
INSERT INTO `wenwo`.`user`(`id`, `name`, `age`, `job`) VALUES (4, '王麻子', 23, '科学家');
INSERT INTO `wenwo`.`user`(`id`, `name`, `age`, `job`) VALUES (5, '小李子', 28, '考古学家');
INSERT INTO `wenwo`.`user`(`id`, `name`, `age`, `job`) VALUES (6, '小柜子', 24, '植物学家');
INSERT INTO `wenwo`.`user`(`id`, `name`, `age`, `job`) VALUES (7, '王大锤', 22, '演员');