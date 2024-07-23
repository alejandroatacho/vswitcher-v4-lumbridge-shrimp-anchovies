int shrimpId = 317;
int shrimpCookId = 315;
int burnShrimpId = 7954;
int fishSpot = 1530;
int anchoviesId = 321;
int anchoviesCookId = 319;
int burnAnchoviesId = 323;

if (v.getInventory().inventoryFull()) {

v.getInventory().drop(shrimpId,anchoviesId,shrimpCookId,burnShrimpId, burnAnchoviesId, anchoviesCookId);

}


else if (v.getLocalPlayer().hasAnimation(-1) && !v.getInventory().inventoryFull()) {

    v.getFishing().net(fishSpot);
}