/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import azf;
/*    */ 
/*    */ public class RealmsLevelSummary implements Comparable
/*    */ {
/*    */   private azf levelSummary;
/*    */   
/*    */   public RealmsLevelSummary(azf paramazf) {
/* 10 */     this.levelSummary = paramazf;
/*    */   }
/*    */   
/*    */   public int getGameMode() {
/* 14 */     return this.levelSummary.f().a();
/*    */   }
/*    */   
/*    */   public String getLevelId() {
/* 18 */     return this.levelSummary.a();
/*    */   }
/*    */   
/*    */   public boolean hasCheats() {
/* 22 */     return this.levelSummary.h();
/*    */   }
/*    */   
/*    */   public boolean isHardcore() {
/* 26 */     return this.levelSummary.g();
/*    */   }
/*    */   
/*    */   public boolean isRequiresConversion() {
/* 30 */     return this.levelSummary.d();
/*    */   }
/*    */   
/*    */   public String getLevelName() {
/* 34 */     return this.levelSummary.b();
/*    */   }
/*    */   
/*    */   public long getLastPlayed() {
/* 38 */     return this.levelSummary.e();
/*    */   }
/*    */   
/*    */   public int compareTo(azf paramazf) {
/* 42 */     return this.levelSummary.a(paramazf);
/*    */   }
/*    */   
/*    */   public long getSizeOnDisk() {
/* 46 */     return this.levelSummary.c();
/*    */   }
/*    */   
/*    */   public int compareTo(RealmsLevelSummary paramRealmsLevelSummary)
/*    */   {
/* 51 */     if (this.levelSummary.e() < paramRealmsLevelSummary.getLastPlayed()) {
/* 52 */       return 1;
/*    */     }
/* 54 */     if (this.levelSummary.e() > paramRealmsLevelSummary.getLastPlayed()) {
/* 55 */       return -1;
/*    */     }
/* 57 */     return this.levelSummary.a().compareTo(paramRealmsLevelSummary.getLevelId());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsLevelSummary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */