/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import aze;
/*    */ import azf;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import qk;
/*    */ 
/*    */ 
/*    */ public class RealmsAnvilLevelStorageSource
/*    */ {
/*    */   private aze levelStorageSource;
/*    */   
/*    */   public RealmsAnvilLevelStorageSource(aze paramaze)
/*    */   {
/* 16 */     this.levelStorageSource = paramaze;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 20 */     return this.levelStorageSource.a();
/*    */   }
/*    */   
/*    */   public boolean levelExists(String paramString) {
/* 24 */     return this.levelStorageSource.f(paramString);
/*    */   }
/*    */   
/*    */   public boolean convertLevel(String paramString, qk paramqk) {
/* 28 */     return this.levelStorageSource.a(paramString, paramqk);
/*    */   }
/*    */   
/*    */   public boolean requiresConversion(String paramString) {
/* 32 */     return this.levelStorageSource.b(paramString);
/*    */   }
/*    */   
/*    */   public boolean isNewLevelIdAcceptable(String paramString) {
/* 36 */     return this.levelStorageSource.d(paramString);
/*    */   }
/*    */   
/*    */   public boolean deleteLevel(String paramString) {
/* 40 */     return this.levelStorageSource.e(paramString);
/*    */   }
/*    */   
/*    */   public boolean isConvertible(String paramString) {
/* 44 */     return this.levelStorageSource.a(paramString);
/*    */   }
/*    */   
/*    */   public void renameLevel(String paramString1, String paramString2) {
/* 48 */     this.levelStorageSource.a(paramString1, paramString2);
/*    */   }
/*    */   
/*    */   public void clearAll() {
/* 52 */     this.levelStorageSource.d();
/*    */   }
/*    */   
/*    */   public List getLevelList() {
/* 56 */     ArrayList localArrayList = new ArrayList();
/* 57 */     for (azf localazf : this.levelStorageSource.b()) {
/* 58 */       localArrayList.add(new RealmsLevelSummary(localazf));
/*    */     }
/* 60 */     return localArrayList;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsAnvilLevelStorageSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */