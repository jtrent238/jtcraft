/*    */ import com.google.common.base.Predicates;
/*    */ import com.google.common.collect.Iterators;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.IdentityHashMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ct
/*    */   implements cs
/*    */ {
/* 14 */   private IdentityHashMap a = new IdentityHashMap(512);
/* 15 */   private List b = Lists.newArrayList();
/*    */   
/*    */   public void a(Object paramObject, int paramInt) {
/* 18 */     this.a.put(paramObject, Integer.valueOf(paramInt));
/*    */     
/*    */ 
/* 21 */     while (this.b.size() <= paramInt) {
/* 22 */       this.b.add(null);
/*    */     }
/*    */     
/* 25 */     this.b.set(paramInt, paramObject);
/*    */   }
/*    */   
/*    */   public int b(Object paramObject)
/*    */   {
/* 30 */     Integer localInteger = (Integer)this.a.get(paramObject);
/* 31 */     return localInteger == null ? -1 : localInteger.intValue();
/*    */   }
/*    */   
/*    */   public Object a(int paramInt)
/*    */   {
/* 36 */     if ((paramInt >= 0) && (paramInt < this.b.size())) {
/* 37 */       return this.b.get(paramInt);
/*    */     }
/*    */     
/* 40 */     return null;
/*    */   }
/*    */   
/*    */   public Iterator iterator()
/*    */   {
/* 45 */     return Iterators.filter(this.b.iterator(), Predicates.notNull());
/*    */   }
/*    */   
/*    */   public boolean b(int paramInt) {
/* 49 */     return a(paramInt) != null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */