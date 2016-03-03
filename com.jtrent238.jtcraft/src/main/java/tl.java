/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.Collection;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class tl
/*    */ {
/* 11 */   protected final Map a = new HashMap();
/* 12 */   protected final Map b = new py();
/*    */   
/*    */   public ti a(th paramth) {
/* 15 */     return (ti)this.a.get(paramth);
/*    */   }
/*    */   
/*    */   public ti a(String paramString) {
/* 19 */     return (ti)this.b.get(paramString);
/*    */   }
/*    */   
/*    */   public abstract ti b(th paramth);
/*    */   
/*    */   public Collection a() {
/* 25 */     return this.b.values();
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(tn paramtn) {}
/*    */   
/*    */   public void a(Multimap paramMultimap)
/*    */   {
/* 33 */     for (Map.Entry localEntry : paramMultimap.entries()) {
/* 34 */       ti localti = a((String)localEntry.getKey());
/*    */       
/* 36 */       if (localti != null) {
/* 37 */         localti.b((tj)localEntry.getValue());
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(Multimap paramMultimap) {
/* 43 */     for (Map.Entry localEntry : paramMultimap.entries()) {
/* 44 */       ti localti = a((String)localEntry.getKey());
/*    */       
/* 46 */       if (localti != null) {
/* 47 */         localti.b((tj)localEntry.getValue());
/* 48 */         localti.a((tj)localEntry.getValue());
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */