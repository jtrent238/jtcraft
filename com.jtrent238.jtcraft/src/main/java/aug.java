/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aug
/*     */   extends ave
/*     */ {
/*     */   private List e;
/*     */   private boolean f;
/*  18 */   private agu[] g = new agu[3];
/*  19 */   private double h = 32.0D;
/*  20 */   private int i = 3;
/*     */   
/*     */   public aug()
/*     */   {
/*  24 */     this.e = new ArrayList();
/*  25 */     for (ahu localahu : ahu.n()) {
/*  26 */       if ((localahu != null) && (localahu.am > 0.0F)) {
/*  27 */         this.e.add(localahu);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public aug(Map paramMap) {
/*  33 */     this();
/*  34 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/*  35 */       if (((String)localEntry.getKey()).equals("distance")) {
/*  36 */         this.h = qh.a((String)localEntry.getValue(), this.h, 1.0D);
/*  37 */       } else if (((String)localEntry.getKey()).equals("count")) {
/*  38 */         this.g = new agu[qh.a((String)localEntry.getValue(), this.g.length, 1)];
/*  39 */       } else if (((String)localEntry.getKey()).equals("spread")) {
/*  40 */         this.i = qh.a((String)localEntry.getValue(), this.i, 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/*  47 */     return "Stronghold";
/*     */   }
/*     */   
/*     */   protected boolean a(int paramInt1, int paramInt2)
/*     */   {
/*     */     Object localObject1;
/*  53 */     if (!this.f) {
/*  54 */       localObject1 = new Random();
/*     */       
/*  56 */       ((Random)localObject1).setSeed(this.c.H());
/*     */       
/*  58 */       double d1 = ((Random)localObject1).nextDouble() * 3.141592653589793D * 2.0D;
/*  59 */       int m = 1;
/*     */       
/*  61 */       for (int n = 0; n < this.g.length; n++) {
/*  62 */         double d2 = (1.25D * m + ((Random)localObject1).nextDouble()) * (this.h * m);
/*  63 */         int i1 = (int)Math.round(Math.cos(d1) * d2);
/*  64 */         int i2 = (int)Math.round(Math.sin(d1) * d2);
/*     */         
/*  66 */         agt localagt = this.c.v().a((i1 << 4) + 8, (i2 << 4) + 8, 112, this.e, (Random)localObject1);
/*  67 */         if (localagt != null) {
/*  68 */           i1 = localagt.a >> 4;
/*  69 */           i2 = localagt.c >> 4;
/*     */         }
/*     */         
/*  72 */         this.g[n] = new agu(i1, i2);
/*     */         
/*  74 */         d1 += 6.283185307179586D * m / this.i;
/*     */         
/*  76 */         if (n == this.i) {
/*  77 */           m += 2 + ((Random)localObject1).nextInt(5);
/*  78 */           this.i += 1 + ((Random)localObject1).nextInt(2);
/*     */         }
/*     */       }
/*     */       
/*  82 */       this.f = true;
/*     */     }
/*  84 */     for (Object localObject2 : this.g) {
/*  85 */       if ((paramInt1 == ((agu)localObject2).a) && (paramInt2 == ((agu)localObject2).b)) {
/*  86 */         return true;
/*     */       }
/*     */     }
/*  89 */     return false;
/*     */   }
/*     */   
/*     */   protected List o_()
/*     */   {
/*  94 */     ArrayList localArrayList = new ArrayList();
/*  95 */     for (agu localagu : this.g) {
/*  96 */       if (localagu != null) {
/*  97 */         localArrayList.add(localagu.a(64));
/*     */       }
/*     */     }
/* 100 */     return localArrayList;
/*     */   }
/*     */   
/*     */   protected avm b(int paramInt1, int paramInt2)
/*     */   {
/* 105 */     auh localauh = new auh(this.c, this.b, paramInt1, paramInt2);
/*     */     
/* 107 */     while ((localauh.b().isEmpty()) || (((auz)localauh.b().get(0)).b == null))
/*     */     {
/* 109 */       localauh = new auh(this.c, this.b, paramInt1, paramInt2);
/*     */     }
/*     */     
/* 112 */     return localauh;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */