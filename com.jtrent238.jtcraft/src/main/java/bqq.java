/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.InputStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bqq
/*    */   implements bqy
/*    */ {
/* 14 */   protected final List a = new ArrayList();
/*    */   private final brw b;
/*    */   
/*    */   public bqq(brw parambrw) {
/* 18 */     this.b = parambrw;
/*    */   }
/*    */   
/*    */   public void a(bra parambra)
/*    */   {
/* 23 */     this.a.add(parambra);
/*    */   }
/*    */   
/*    */   public Set a()
/*    */   {
/* 28 */     return null;
/*    */   }
/*    */   
/*    */   public bqw a(bqx parambqx)
/*    */   {
/* 33 */     Object localObject = null;
/* 34 */     bqx localbqx = c(parambqx);
/*    */     
/* 36 */     for (int i = this.a.size() - 1; i >= 0; i--) {
/* 37 */       bra localbra = (bra)this.a.get(i);
/* 38 */       if ((localObject == null) && (localbra.b(localbqx))) {
/* 39 */         localObject = localbra;
/*    */       }
/*    */       
/* 42 */       if (localbra.b(parambqx)) {
/* 43 */         InputStream localInputStream = null;
/* 44 */         if (localObject != null) {
/* 45 */           localInputStream = ((bra)localObject).a(localbqx);
/*    */         }
/* 47 */         return new bri(parambqx, localbra.a(parambqx), localInputStream, this.b);
/*    */       }
/*    */     }
/*    */     
/* 51 */     throw new FileNotFoundException(parambqx.toString());
/*    */   }
/*    */   
/*    */   public List b(bqx parambqx)
/*    */   {
/* 56 */     ArrayList localArrayList = Lists.newArrayList();
/* 57 */     bqx localbqx = c(parambqx);
/*    */     
/* 59 */     for (bra localbra : this.a) {
/* 60 */       if (localbra.b(parambqx)) {
/* 61 */         InputStream localInputStream = localbra.b(localbqx) ? localbra.a(localbqx) : null;
/* 62 */         localArrayList.add(new bri(parambqx, localbra.a(parambqx), localInputStream, this.b));
/*    */       }
/*    */     }
/*    */     
/* 66 */     if (localArrayList.isEmpty()) {
/* 67 */       throw new FileNotFoundException(parambqx.toString());
/*    */     }
/*    */     
/* 70 */     return localArrayList;
/*    */   }
/*    */   
/*    */   static bqx c(bqx parambqx) {
/* 74 */     return new bqx(parambqx.b(), parambqx.a() + ".mcmeta");
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */