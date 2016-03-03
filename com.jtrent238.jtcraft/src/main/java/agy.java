/*     */ import java.util.Set;
/*     */ import java.util.TreeMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agy
/*     */ {
/*  20 */   private TreeMap a = new TreeMap();
/*     */   
/*     */   public agy() {
/*  23 */     a("doFireTick", "true");
/*  24 */     a("mobGriefing", "true");
/*  25 */     a("keepInventory", "false");
/*  26 */     a("doMobSpawning", "true");
/*  27 */     a("doMobLoot", "true");
/*  28 */     a("doTileDrops", "true");
/*  29 */     a("commandBlockOutput", "true");
/*  30 */     a("naturalRegeneration", "true");
/*  31 */     a("doDaylightCycle", "true");
/*     */   }
/*     */   
/*     */   public void a(String paramString1, String paramString2) {
/*  35 */     this.a.put(paramString1, new agz(paramString2));
/*     */   }
/*     */   
/*     */   public void b(String paramString1, String paramString2) {
/*  39 */     agz localagz = (agz)this.a.get(paramString1);
/*  40 */     if (localagz != null) {
/*  41 */       localagz.a(paramString2);
/*     */     } else {
/*  43 */       a(paramString1, paramString2);
/*     */     }
/*     */   }
/*     */   
/*     */   public String a(String paramString) {
/*  48 */     agz localagz = (agz)this.a.get(paramString);
/*  49 */     if (localagz != null) {
/*  50 */       return localagz.a();
/*     */     }
/*  52 */     return "";
/*     */   }
/*     */   
/*     */   public boolean b(String paramString) {
/*  56 */     agz localagz = (agz)this.a.get(paramString);
/*  57 */     if (localagz != null) {
/*  58 */       return localagz.b();
/*     */     }
/*  60 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public dh a()
/*     */   {
/*  80 */     dh localdh = new dh();
/*     */     
/*  82 */     for (String str : this.a.keySet()) {
/*  83 */       agz localagz = (agz)this.a.get(str);
/*  84 */       localdh.a(str, localagz.a());
/*     */     }
/*     */     
/*  87 */     return localdh;
/*     */   }
/*     */   
/*     */   public void a(dh paramdh) {
/*  91 */     Set localSet = paramdh.c();
/*  92 */     for (String str1 : localSet) {
/*  93 */       String str2 = str1;
/*  94 */       String str3 = paramdh.j(str1);
/*     */       
/*  96 */       b(str2, str3);
/*     */     }
/*     */   }
/*     */   
/*     */   public String[] b() {
/* 101 */     return (String[])this.a.keySet().toArray(new String[0]);
/*     */   }
/*     */   
/*     */   public boolean e(String paramString) {
/* 105 */     return this.a.containsKey(paramString);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */