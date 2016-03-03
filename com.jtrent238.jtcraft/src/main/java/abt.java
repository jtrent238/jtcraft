/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class abt
/*     */ {
/*  12 */   public static final abt[] a = new abt[12];
/*  13 */   public static final abt b = new abu(0, "buildingBlocks");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  19 */   public static final abt c = new aby(1, "decorations");
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
/*  30 */   public static final abt d = new abz(2, "redstone");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  36 */   public static final abt e = new aca(3, "transportation");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  42 */   public static final abt f = new acb(4, "misc").a(new afu[] { afu.a });
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  48 */   public static final abt g = new acc(5, "search").a("item_search.png");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  55 */   public static final abt h = new acd(6, "food");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */   public static final abt i = new ace(7, "tools").a(new afu[] { afu.h, afu.i, afu.j });
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */   public static final abt j = new acf(8, "combat").a(new afu[] { afu.b, afu.c, afu.f, afu.d, afu.e, afu.k, afu.g });
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */   public static final abt k = new abv(9, "brewing");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */   public static final abt l = new abw(10, "materials");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */   public static final abt m = new abx(11, "inventory").a("inventory.png").k().i();
/*     */   
/*     */ 
/*     */   private final int n;
/*     */   
/*     */ 
/*     */   private final String o;
/*     */   
/*     */ 
/*  98 */   private String p = "items.png";
/*  99 */   private boolean q = true;
/* 100 */   private boolean r = true;
/*     */   private afu[] s;
/*     */   private add t;
/*     */   
/*     */   public abt(int paramInt, String paramString) {
/* 105 */     this.n = paramInt;
/* 106 */     this.o = paramString;
/*     */     
/* 108 */     a[paramInt] = this;
/*     */   }
/*     */   
/*     */   public int a() {
/* 112 */     return this.n;
/*     */   }
/*     */   
/*     */   public String b() {
/* 116 */     return this.o;
/*     */   }
/*     */   
/*     */   public String c() {
/* 120 */     return "itemGroup." + b();
/*     */   }
/*     */   
/*     */   public add d() {
/* 124 */     if (this.t == null) {
/* 125 */       this.t = new add(e(), 1, f());
/*     */     }
/* 127 */     return this.t;
/*     */   }
/*     */   
/*     */   public abstract adb e();
/*     */   
/*     */   public int f() {
/* 133 */     return 0;
/*     */   }
/*     */   
/*     */   public String g() {
/* 137 */     return this.p;
/*     */   }
/*     */   
/*     */   public abt a(String paramString) {
/* 141 */     this.p = paramString;
/* 142 */     return this;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 146 */     return this.r;
/*     */   }
/*     */   
/*     */   public abt i() {
/* 150 */     this.r = false;
/* 151 */     return this;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 155 */     return this.q;
/*     */   }
/*     */   
/*     */   public abt k() {
/* 159 */     this.q = false;
/* 160 */     return this;
/*     */   }
/*     */   
/*     */   public int l() {
/* 164 */     return this.n % 6;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 168 */     return this.n < 6;
/*     */   }
/*     */   
/*     */   public afu[] n() {
/* 172 */     return this.s;
/*     */   }
/*     */   
/*     */   public abt a(afu... paramVarArgs) {
/* 176 */     this.s = paramVarArgs;
/* 177 */     return this;
/*     */   }
/*     */   
/*     */   public boolean a(afu paramafu) {
/* 181 */     if (this.s == null) { return false;
/*     */     }
/* 183 */     for (afu localafu : this.s) {
/* 184 */       if (localafu == paramafu) { return true;
/*     */       }
/*     */     }
/* 187 */     return false;
/*     */   }
/*     */   
/*     */   public void a(List paramList) {
/* 191 */     for (adb localadb : adb.e) {
/* 192 */       if ((localadb != null) && 
/* 193 */         (localadb.n_() == this)) {
/* 194 */         localadb.a(localadb, this, paramList);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 199 */     if (n() != null) {
/* 200 */       a(paramList, n());
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(List paramList, afu... paramVarArgs) {
/* 205 */     for (aft localaft : aft.b) {
/* 206 */       if ((localaft != null) && (localaft.C != null)) {
/* 207 */         int i3 = 0;
/*     */         
/* 209 */         for (int i4 = 0; (i4 < paramVarArgs.length) && (i3 == 0); i4++) {
/* 210 */           if (localaft.C == paramVarArgs[i4]) { i3 = 1;
/*     */           }
/*     */         }
/* 213 */         if (i3 != 0) {
/* 214 */           paramList.add(ade.bR.a(new agc(localaft, localaft.b())));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */