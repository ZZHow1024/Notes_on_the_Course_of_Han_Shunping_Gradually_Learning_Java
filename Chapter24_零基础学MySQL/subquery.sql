#Created by ZZHow(ZZHow1024) on 2024/7/14.
#子查询当做临时表使用
#案例：查询 ecshop 中各个类别中，价格最高的商品
SELECT `goods_id`, `ecs_goods`.`cat_id`, `goods_name`, `shop_price`
	FROM(
		SELECT `cat_id`, MAX(`shop_price`) AS 'max_price'
		FROM `ecs_goods`
		GROUP BY `cat_id`
	) `temp`, `ecs_goods`
		WHERE `temp`.`cat_id` = `ecs_goods`.`cat_id`
		AND `temp`.`max_price` = `ecs_goods`.`shop_price`;