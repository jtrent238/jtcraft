/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class tb
/*     */   extends ss
/*     */ {
/*     */   public tc e;
/*     */   
/*     */   public tb(ahb paramahb)
/*     */   {
/*  65 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public tb(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  69 */     super(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     
/*  71 */     ArrayList localArrayList = new ArrayList();
/*  72 */     for (tc localtc : tc.values()) {
/*  73 */       this.e = localtc;
/*  74 */       a(paramInt4);
/*  75 */       if (e()) {
/*  76 */         localArrayList.add(localtc);
/*     */       }
/*     */     }
/*  79 */     if (!localArrayList.isEmpty()) {
/*  80 */       this.e = ((tc)localArrayList.get(this.Z.nextInt(localArrayList.size())));
/*     */     }
/*  82 */     a(paramInt4);
/*     */   }
/*     */   
/*     */   public tb(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString) {
/*  86 */     this(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     
/*  88 */     for (tc localtc : tc.values()) {
/*  89 */       if (localtc.B.equals(paramString)) {
/*  90 */         this.e = localtc;
/*  91 */         break;
/*     */       }
/*     */     }
/*  94 */     a(paramInt4);
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  99 */     paramdh.a("Motive", this.e.B);
/* 100 */     super.b(paramdh);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 105 */     String str = paramdh.j("Motive");
/* 106 */     for (tc localtc : tc.values()) {
/* 107 */       if (localtc.B.equals(str)) {
/* 108 */         this.e = localtc;
/*     */       }
/*     */     }
/* 111 */     if (this.e == null) this.e = tc.a;
/* 112 */     super.a(paramdh);
/*     */   }
/*     */   
/*     */   public int f()
/*     */   {
/* 117 */     return this.e.C;
/*     */   }
/*     */   
/*     */   public int i()
/*     */   {
/* 122 */     return this.e.D;
/*     */   }
/*     */   
/*     */   public void b(sa paramsa)
/*     */   {
/* 127 */     if ((paramsa instanceof yz)) {
/* 128 */       yz localyz = (yz)paramsa;
/*     */       
/* 130 */       if (localyz.bE.d) {
/* 131 */         return;
/*     */       }
/*     */     }
/*     */     
/* 135 */     a(new add(ade.an), 0.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */